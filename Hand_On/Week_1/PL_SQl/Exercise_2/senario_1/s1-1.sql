-- Excerics - 2
-- Error Handling
-- Scenario 1

CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    p_from_account IN NUMBER,
    p_to_account IN NUMBER,
    p_amount IN NUMBER
)
IS
    v_balance Accounts.Balance%TYPE;
BEGIN
    -- Get source account balance
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account;

    -- Check balance
    IF v_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Transfer Failed: Insufficient Balance');
        RETURN;
    END IF;

    -- Deduct amount from source account
    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_from_account;

    -- Add amount to destination account
    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_to_account;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Transfer Successful');
    DBMS_OUTPUT.PUT_LINE(
        'Transferred Amount: ' || p_amount
    );

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE(
            'Transfer Failed: Account not found'
        );
        ROLLBACK;

    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(
            'Error: ' || SQLERRM
        );
        ROLLBACK;
END;
/

BEGIN
    SafeTransferFunds(101,102,2000);
END;
/

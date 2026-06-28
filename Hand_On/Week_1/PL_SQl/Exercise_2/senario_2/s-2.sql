-- Excerics - 2
-- Error Handling
-- Scenario 2

CREATE OR REPLACE PROCEDURE UpdateSalary(
    p_emp_id IN NUMBER,
    p_percentage IN NUMBER
)
IS
    v_salary NUMBER;
BEGIN
    -- Check whether employee exists
    SELECT Salary
    INTO v_salary
    FROM Employees
    WHERE EmployeeID = p_emp_id;

    -- Update salary
    UPDATE Employees
    SET Salary = Salary + (Salary * p_percentage / 100)
    WHERE EmployeeID = p_emp_id;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Salary updated successfully.');

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE(
            'Employee ID does not exist.'
        );

    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(
            'Error: ' || SQLERRM
        );
END;
/

BEGIN
    UpdateSalary(1,10);
END;
/

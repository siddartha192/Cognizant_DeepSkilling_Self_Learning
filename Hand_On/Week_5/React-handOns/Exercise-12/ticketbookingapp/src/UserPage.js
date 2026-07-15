import FlightDetails from "./FlightDetails";

function UserPage({logout}){
    return(
        <div>
            <h1> Welcome to User Page </h1>
            <p> You can book your flight tickets here </p>
            <FlightDetails />
            <br />
            <button>Book Tickets</button>

            <button onClick={logout}>Logout</button>
        </div>
    );
}

export default UserPage;

import React,{useState} from "react"; 

function LoginButton(props){

    return(
        <button onClick={props.onClick}>
            Login
        </button>
    )

}

function LogoutButton(props){

    return(
        <button onClick={props.onClick}>
            Logout
        </button>
    )

}

function GuestGreeting(){

    return(
        <h1>Please Sign Up.</h1>
    )

}

function UserGreeting(){

    return(
        <h1>Welcome Back</h1>
    )

}

function Greeting(props){

    if(props.isLoggedIn){

        return <UserGreeting/>

    }

    return <GuestGreeting/>

}

function App(){

    const [isLoggedIn,setLogin]=useState(false);

    return(

        <div>

            <Greeting isLoggedIn={isLoggedIn}/>

            {

                isLoggedIn?

                <LogoutButton
                    onClick={()=>setLogin(false)}
                />

                :

                <LoginButton
                    onClick={()=>setLogin(true)}
                />

            }

        </div>

    )

}

export default App;
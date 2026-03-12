import { useState } from "react"
import "./Login.css"
import { useNavigate } from "react-router"

function Login({userdata, setUserInfo}){
    const [userName, setUserName] = useState('')
    const [passWord, setPassWord] = useState('')
    
    const navigate = useNavigate()

    return <div className="LoginVerticalAlign">
        <div className="LoginIsland">
            <div className="LoginTitle">Login</div>
            <div className="LoginLabel">User Name:</div>
            <input type="text" className="LoginUserName" value={userName} onChange={(e) => setUserName(e.target.value)} />
            <div className="LoginLabel">Password:</div>
            <input type="text" className="LoginPassword" value={passWord} onChange={(e) => setPassWord(e.target.value)} />
            <div className="LoginButtonContainer">
                <button className="LoginButton" onClick={() => {
                    let index = userdata.findIndex(user => user.username === userName)
                    if(index !== -1){
                        if(userdata[index].password === passWord){
                            console.log("works password")
                            setUserInfo(userName)
                            navigate("/profile")
                        }
                    }
                }}>Login</button>    
            </div>
        </div>
    </div>
}

export default Login
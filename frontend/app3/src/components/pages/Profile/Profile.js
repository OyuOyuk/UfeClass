import "./Profile.css"
import { Navigate } from "react-router"
function Profile({userinfo}){
    if(userinfo == ''){
        return(
            <Navigate to ="/login" replace/>
        )
    }
    return <div>
        
    </div>
}
export default Profile
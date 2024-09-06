public class ABC_Server {
    private Publisher server;

    public ABC_Server(){
        server = new Publisher();
    }

    public void addUser(String type, User user){
        server.subscribe(type, user);
    }

    public void removeUser(String type, User user){
        server.unsubscribe(type, user);
    }

    public void notifyAllUser(String previous_state, String current_state){
        if(previous_state.equalsIgnoreCase("Operational")){
            if(current_state.equalsIgnoreCase("Partially down")){
                server.notifyUser("premium", "Previous State: " + previous_state + " and Current State: " + current_state ," Do you want to use service from two servers (partially from the server of ABC and partially from the server of DEF) or from one server (DEF)?");
                server.notifyUser("regular", "Previous State: " + previous_state + " and Current State: " + current_state ," Do you want to continue using the limited functionality or pay $20 per hour to enjoy the full functionality taking service from server of DEF (this will copy all your data to the server of DEF)?");
            }
            if(current_state.equalsIgnoreCase("Fully down")){
                server.notifyUser("premium", "Previous State: " + previous_state + " and Current State: " + current_state ," The service is now provided by their partner DEF company.");
                server.notifyUser("regular", "Previous State: " + previous_state + " and Current State: " + current_state ," Do you want to pay $20 per hour to take service from server of DEF (this will copy all your data to the server of DEF)?");
            }
        }
        else if(previous_state.equalsIgnoreCase("Partially down")){
            if(current_state.equalsIgnoreCase("Operational")){
                server.notifyUser("regular", "Previous State: " + previous_state + " and Current State: " + current_state ," The total bill since the last state change is" + " $20.");
            }
            if(current_state.equalsIgnoreCase("Fully down")){
                server.notifyUser("premium", "Previous State: " + previous_state + " and Current State: " + current_state ," We will shift all the services to the server of DEF.");
            }
        }
        else if(previous_state.equalsIgnoreCase("Fully down ")){
            if(current_state.equalsIgnoreCase("Operational")){
                server.notifyUser("regular", "Previous State: " + previous_state + " and Current State: " + current_state ," The total bill since the last state change is" + " $20.");
            }
        }
    }

}

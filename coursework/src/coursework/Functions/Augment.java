package coursework.Functions;

import coursework.Objects.*;
import coursework.Users.User;

public class Augment {
    //ADD Objects to the file.
    public static void addUser(User _input){
        
        User output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readUsers();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.userArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeUsers(output);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }   //adds a user to the system
    public static void addRating(Rating _input){
        
        Rating output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readRatings();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){
                output[i] = _input;
                hasNull = true;
                break;
            }
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.ratingArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeRatings(output);
        }catch(Exception e){
            System.out.println(e);
        }
    }   //adds a rating to the system
    public static void addFeedback(Feedback _input){
        
        Feedback output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readFeedback();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.feedbackArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeFeedbacks(output);
        }catch(Exception e){
            System.out.println(e);
        }
    }   //adds a feedback to the system
    public static void addPrescription(Prescription _input){
        
        Prescription output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readPrescriptions();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.prescriptionArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writePrescriptions(output);
        }catch(Exception e){
            System.out.println(e);
        }
    }   //adds a prescription to the system
    public static void addAppointment(Appointment _input){
        
        Appointment output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readAppointments();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.appointmentArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeAppointments(output);
        }catch(Exception e){
            System.out.println(e);
        }
    }   //adds an appointment to the system
    public static void addRequest(User _input){
        
        User output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readRequests();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.userArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeAccountRequests(output);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }   //adds a user to the account creation requests
    public static void addMedicine(Medicine _input){
        Medicine output[] = null;
        boolean hasNull = false;
        try{
            output = FileReader.readMedicines();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){
                output[i] = _input;
                hasNull = true;
                break;
            }
            else{}
        }
        if(hasNull == false){
            output = Resize.medicineArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeMedicines(output);
        }catch(Exception e){}
    }   
    public static void addOrder(Medicine _input){
        Medicine output[] = null;
        boolean hasNull = false;
        try{
            output = FileReader.readOrders();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){
                output[i] = _input;
                hasNull = true;
                break;
            }
            else{}
        }
        if(hasNull == false){
            output = Resize.medicineArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeMedicineOrders(output);
        }catch(Exception e){}
    }
    
    //REMOVE Objects from the file.
    public static void removeUser(String _input){
        
    }
    public static void removeRating(String _input){
        
    }
    public static void removeFeedback(String _input){
        
    }
    public static void removePrescription(String _input){
        
    }
    public static void removeAppointmentRequest(String _input){
        Appointment output[] = null;
        try{
            output = FileReader.readAppointmentRequests();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i].getAppointmentID().compareTo(_input) == 0){
                output[i] = null;
            }
        }
        output = trimAppointments(output);
        try{
            FileWriter.writeAppointmentRequests(output);
        }catch(Exception e){}
    }//for appointment approvals
    public static void removeApproval(String _input){
        User output[] = null;
        try{
            output = FileReader.readRequests();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i].getUniqueID().compareTo(_input) == 0){
                output[i] = null;
            }
        }
        output = trimUsers(output);
        try{
            FileWriter.writeAccountRequests(output);
        }catch(Exception e){}
    }//for patient approvals
    public static void removeMedicineOrder(String _input){
        Medicine output[] = null;
        try{
            output = FileReader.readOrders();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i].getMedicineName().compareTo(_input) == 0){
                output[i] = null;
            }
        }
        output = trimMedicines(output);
        try{
            FileWriter.writeMedicineOrders(output);
        }catch(Exception e){}
    }
    
    //TRIM NULL Elements.
    public static User[] trimUsers(User[] _input){
        User[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        while(_input[_input.length - 1] == null){
            _input = Resize.shortenUsers(_input);
        }
        output = _input;
        return output;
    }
    public static Rating[] trimRatings(Rating[] _input){
        Rating[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        while(_input[_input.length - 1] == null){
            _input = Resize.shortenRatings(_input);
        }
        output = _input;
        return output;
    }
    public static Feedback[] trimFeedback(Feedback[] _input){
        Feedback[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        while(_input[_input.length - 1] == null){
            _input = Resize.shortenFeedback(_input);
        }
        output = _input;
        return output;
    }
    public static Prescription[] trimPrescriptions(Prescription[] _input){
        Prescription[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        while(_input[_input.length - 1] == null){
            _input = Resize.shortenPrescription(_input);
        }
        output = _input;
        return output;
    }
    public static Appointment[] trimAppointments(Appointment[] _input){
        Appointment[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        while(_input[_input.length - 1] == null){
            _input = Resize.shortenAppointment(_input);
        }
        output = _input;
        return output;
    }
    public static User[] trimRequests(User[] _input){
        User[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        while(_input[_input.length - 1] == null){
            _input = Resize.shortenUsers(_input);
        }
        output = _input;
        return output;
    }
    public static Medicine[] trimMedicines(Medicine[] _input){
        Medicine output[] = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        while(_input[_input.length - 1] == null){
            _input = Resize.shortenMedicines(_input);
        }
        output = _input;
        return output;
    }
}

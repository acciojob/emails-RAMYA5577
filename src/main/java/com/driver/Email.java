package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password
        // and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character.
        // Any character apart from alphabets and digits is a special character

        if(!password.equals(oldPassword)){
            System.out.println("Old password doesn't match with current password");
       return ;
        }
        if(newPassword.length()<8){
            System.out.println("new password length must contain 8 characters");
            return;
        }
        if(!containsUpperCase(newPassword)){
            System.out.println("new password must contain at least one uppercase character");
            return;
        }
        if(!containsLowerCase(newPassword)){
            System.out.println("new passwrod must contain atleast one lowercase character");
            return;
        }
        if(!containsDigit(newPassword)){
            System.out.println("new password must contain atleast one digit");
            return;
        }
        if(!containsSpecialCharacter(newPassword)){
            System.out.println("new Password must contain atleast one special character");
            return;
        }
        password=newPassword;
        System.out.println("Password changed successfully");
    }

    public boolean containsUpperCase(String password){
        for(char c:password.toCharArray()){
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }

    public boolean containsLowerCase(String password){
        for(char c:password.toCharArray()){
            if(Character.isLowerCase(c)){
                return true;
            }
        }
        return false;
    }

    public boolean containsDigit(String password){
        for (char c:password.toCharArray()){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public boolean containsSpecialCharacter(String password){
        for (char c:password.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                return true;
            }
        }
        return false;
    }
}

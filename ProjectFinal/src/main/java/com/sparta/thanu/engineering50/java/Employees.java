package com.sparta.thanu.engineering50.java;
public class Employees {
        String employeeId;
        String employeeTitle;
        String employeeFirstName;
        String employeeMiddleInitial;
        String employeeLastName;
        String employeeGender;
        String employeeEmail;
        String employeeDateOfBirth;
        String employeeJoinDate;

    public Employees(String employeeId, String employeeTitle, String employeeFirstName, String employeeMiddleInitial, String employeeLastName, String employeeGender, String employeeEmail, String employeeDateOfBirth, String employeeJoinDate, String employeeSalary) {
        this.employeeId = employeeId;
        this.employeeTitle = employeeTitle;
        this.employeeFirstName = employeeFirstName;
        this.employeeMiddleInitial = employeeMiddleInitial;
        this.employeeLastName = employeeLastName;
        this.employeeGender = employeeGender;
        this.employeeEmail = employeeEmail;
        this.employeeDateOfBirth = employeeDateOfBirth;
        this.employeeJoinDate = employeeJoinDate;
        this.employeeSalary = employeeSalary;
    }

    String employeeSalary;
        public void returnEmployees(){
            System.out.println(getId() + "" + getTitle()+ getTitle() + "" + getFirstName() + getMiddleInitial() +
                    "" + getLastName() + "" + getGender() + getEmail() + "" + getDateOfBirth() + getJoinDate() + "" + getSalary());
        }

        public Employees (String[] arrayEmp)
        {
            this.employeeId = arrayEmp[0];
            this.employeeTitle = arrayEmp[1];
            this.employeeFirstName = arrayEmp[2];
            this.employeeMiddleInitial = arrayEmp[3];
            this.employeeLastName = arrayEmp[4];
            this.employeeGender = arrayEmp[5];
            this.employeeEmail = arrayEmp[6];
            this.employeeDateOfBirth = arrayEmp[7];
            this.employeeJoinDate = arrayEmp[8];
            this.employeeSalary = arrayEmp[9];
        }

        public String getId() {
            return this.employeeId;
        }
        public String getTitle() {
            return this.employeeTitle;
        }
        public String getFirstName() {
            return this.employeeFirstName;
        }
        public String getMiddleInitial() {
            return this.employeeMiddleInitial;
        }
        public String getLastName(){
            return this.employeeLastName;
        }
        public String getGender(){
            return this.employeeGender;
        }
        public String getEmail() {
            return this.employeeEmail;
        }
        public String getDateOfBirth(){
            return this.employeeDateOfBirth;
        }
        public String getJoinDate(){
            return this.employeeJoinDate;
        }
        public String getSalary() {
            return this.employeeSalary;
        }
}

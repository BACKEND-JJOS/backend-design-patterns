package com.jjos.prototype;

import com.jjos.prototype.models.Address;
import com.jjos.prototype.models.Contact;
import com.jjos.prototype.models.Employee;
import com.jjos.prototype.models.Phone;

public class Main {
    public static void main(String[] args) {


        Employee employee  = new Employee
                .EmployeeBuilder()
                .setAge(24)
                .setName("Juan Ortiz")
                .setGender("Masculino")
                .setAddress(new Address("Entre Lomas", "Armenia", "Colombia","10101012"))
                .setAddress("Granada ", "Armenia", "Colombia","10101011")
                .setPhone("3005905557", "+57", "Celular")
                .setPhone("7400402", "+606", "Fijo")
                .setContact(
                        new Contact(
                                "Maria Camila",
                                new Phone("3005905557", "+57", "Celular"),
                                new Address("Entre Lomas", "Armenia", "Colombia","10101012")
                        )
                )
                .build();

        System.out.println("employee = " + employee);

    }
}
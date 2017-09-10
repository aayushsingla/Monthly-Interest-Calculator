package com.example.aayush.monthlyinterestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.*;
    public class applicants extends AppCompatActivity {

    public static float RI = 1.0f;
        public static String Name;
        public static double Amount;

        public void setdimension(String a, double b, float c) {
            Name = a;
            Amount = b;
            RI = c;
        }

        public void showdimension() {
            System.out.println("Name=" + Name);
            System.out.println("Amount=" + Amount);
            System.out.println("Rate = " + RI);
            System.out.println("Final Amount=" + ((applicants.RI * Amount / 100) + Amount));
        }

        public static void main(String[] args) {
            applicants abc = new applicants();
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter name: ");
            Name = reader.nextLine();
            System.out.println();
            System.out.print("Enter amount: ");
            Amount = reader.nextInt();
            System.out.println();
            System.out.print("Enter rate: ");
            RI = reader.nextFloat();
            System.out.println();


            abc.setdimension(Name, Amount, RI);


            abc.showdimension();

        }

         @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


        }
    }
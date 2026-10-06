# Courier & Parcel Management System

## Case Study 198 – Java Programming

A console-based Java application designed to manage courier and parcel records. The system allows users to register parcels, calculate delivery charges based on weight and delivery type, generate parcel receipts, and search for existing parcel records.

---

## Problem Statement

A courier company requires a system to register parcels, calculate delivery charges, classify delivery types, and track parcel records.

---

## Objectives

The system is designed to:

- Register customer parcels
- Accept parcel weight
- Allow selection of delivery type
- Calculate delivery charges
- Generate parcel receipts
- Search parcel records

---

## Technologies Used

- Java
- Java Scanner
- Arrays
- Switch Statements
- If-Else Statements
- Loops
- Linear Search

---

## Features

### 1. Register Parcel
The user can enter:

- Parcel ID
- Customer Name
- Parcel Weight
- Delivery Type

### 2. Delivery Types

The system supports:

- Normal Delivery
- Express Delivery
- Same Day Delivery

### 3. Delivery Charge Calculation

The delivery charge is calculated using:

- Selected delivery type
- Parcel weight

Different base charges are assigned to each delivery category, with additional charges applied based on parcel weight.

> Note: The charge rates used in the implementation are illustrative because the case study does not specify fixed numerical rates.

### 4. Parcel Receipt

After registration, the system generates a receipt containing:

- Parcel ID
- Customer Name
- Weight
- Delivery Type
- Delivery Charge

### 5. Search Parcel

Users can search for a parcel using its Parcel ID.

The system uses linear search to find the corresponding record.

---

## Java Concepts Demonstrated

### Arrays

Arrays are used to store multiple parcel records.

```java
int[] parcelId = new int[100];
String[] customerName = new String[100];
double[] weight = new double[100];
double[] charge = new double[100];
int[] deliveryType = new int[100];

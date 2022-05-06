package com.example.demo.model1;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@Component
public class CustomerList {

	List<Customer>custList;
}

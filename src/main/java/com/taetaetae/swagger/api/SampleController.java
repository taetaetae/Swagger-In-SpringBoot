package com.taetaetae.swagger.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
public class SampleController {

	@ApiOperation(value = "덧셈", notes = "num1 과 num2 를 더합니다.")
	@GetMapping(value = "/addition")
	public Integer addition(Integer num1, Integer num2) {
		return num1 + num2;
	}

	@ApiOperation(value = "뺄셈", notes = "num1 에서 num2 를 뺍니다.")
	@PostMapping(value = "/subtraction")
	public Integer subtraction(Integer num1, Integer num2) {
		return num1 - num2;
	}

	@ApiOperation(value = "곱셈", notes = "num1 에 num2 를 곱합니다.")
	@PutMapping(value = "/multiplication")
	public Integer multiplication(Integer num1, Integer num2) {
		return num1 * num2;
	}

	@ApiOperation(value = "나눗셈", notes = "num1 에서 num2 로 나눕니다.")
	@DeleteMapping(value = "/division")
	public Integer division(Integer num1, Integer num2) {
		return num1 / num2;
	}
}

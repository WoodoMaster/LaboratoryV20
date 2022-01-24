package com.niptis.LaboratoryV20.entity;

import java.util.Objects;

public class Greeting {
private String message;


public Greeting(String message) {
	super();
	this.message = message;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public int hashCode() {
	return Objects.hash(message);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Greeting other = (Greeting) obj;
	return Objects.equals(message, other.message);
}


}

package com.animesh.observable;

import rx.Observable;

public class ObservablePattern {
	
	public static void main(String[] args) {
		String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
		Observable<String> observable = Observable.from(letters);
		observable.subscribe(
				System.out::println,
				Throwable::getStackTrace,
				()->System.out.println("It is complete"));
		
	}
}

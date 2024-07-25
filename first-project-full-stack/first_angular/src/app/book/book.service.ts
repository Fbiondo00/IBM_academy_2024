import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { BookServiceI } from './bookI.service';
import { Book } from './model/book.model';

@Injectable({
  providedIn: 'root'
})
export class BookService implements BookServiceI {

  errorHandler(exception:any) {

    let errorMessage = '';

    if(exception.error instanceof ErrorEvent) {
      errorMessage = exception.error.message;
    } else {
      errorMessage =` Error Code: ${exception.status}\nMessage: ${exception.message}`;
    }
    return throwError(()=>new Error(errorMessage));
 }

  private apiURL = "http://localhost:8080/rest/api/books";
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }


  constructor(private httpClient:HttpClient) {



   }
  updateBook(book: Book): Observable<any> {
    return this.httpClient.put(this.apiURL, JSON.stringify(book), this.httpOptions)
    .pipe(
      catchError(this.errorHandler)
    )
  }
   getBook(): Observable<any> {

       return this.httpClient.get(this.apiURL)

       .pipe(
         catchError(this.errorHandler)
       )
     }

     getBookbyCode(isbn: string): Observable<any> {

       return this.httpClient.get(this.apiURL + '/isbn/' + isbn)

       .pipe(
         catchError(this.errorHandler)
       )
     }

     saveBook(book: Book): Observable<any> {

       return this.httpClient.post(this.apiURL, JSON.stringify(book), this.httpOptions)

       .pipe(
         catchError(this.errorHandler)
       )
     }

     removeBook(isbn: string): Observable<any> {

      return this.httpClient.delete(this.apiURL + '/isbn/' + isbn)

      .pipe(
        catchError(this.errorHandler)
      )
    }
}

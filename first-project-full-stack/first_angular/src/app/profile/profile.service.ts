import { Injectable } from '@angular/core';
import { ProfileServiceI } from './profileI.model';
import { catchError, Observable, throwError } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Profile } from './model/profile.model';

@Injectable({
  providedIn: 'root'
})
export class ProfileService implements ProfileServiceI {


  errorHandler(exception:any) {

    let errorMessage = '';

    if(exception.error instanceof ErrorEvent) {
      errorMessage = exception.error.message;
    } else {
      errorMessage =` Error Code: ${exception.status}\nMessage: ${exception.message}`;
    }
    return throwError(()=>new Error(errorMessage));
 }

  private apiURL = "http://localhost:8080/rest/api/profiles";
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }


  constructor(private httpClient:HttpClient) {



   }
  updateProfile(profile: Profile): Observable<any> {
    return this.httpClient.put(this.apiURL, JSON.stringify(profile), this.httpOptions)
    .pipe(
      catchError(this.errorHandler)
    )
  }
   getProfile(): Observable<any> {

       return this.httpClient.get(this.apiURL)

       .pipe(
         catchError(this.errorHandler)
       )
     }

     getProfilebyCode(id: string): Observable<any> {

       return this.httpClient.get(this.apiURL + '/id/' + id)

       .pipe(
         catchError(this.errorHandler)
       )
     }

     saveProfile(profile: Profile): Observable<any> {

       return this.httpClient.post(this.apiURL, JSON.stringify(profile), this.httpOptions)

       .pipe(
         catchError(this.errorHandler)
       )
     }

     removeProfile(isbn: string): Observable<any> {

      return this.httpClient.delete(this.apiURL + '/isbn/' + isbn)

      .pipe(
        catchError(this.errorHandler)
      )
    }
}

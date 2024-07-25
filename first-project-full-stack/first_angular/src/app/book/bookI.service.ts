import { Observable } from "rxjs";

import { InjectionToken } from "@angular/core";
import { Book } from "./model/book.model";

export const books_service_token = new InjectionToken<BookServiceI>('book_service_token');

export interface BookServiceI {
	getBook(): Observable<any>;
	getBookbyCode(code: string): Observable<any> ;
	saveBook(book: Book): Observable<any>;
	removeBook(code: string): Observable<any>;
	updateBook(book: Book): Observable<any>;
}

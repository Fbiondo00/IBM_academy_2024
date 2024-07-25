import { Component, inject, OnInit } from '@angular/core';

import { books_service_token, BookServiceI } from '../bookI.service';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { BookService } from '../book.service';
import { Book } from '../mode/book.model';

@Component({
  selector: 'app-index',
  standalone: true,
  providers:[{provide:books_service_token,useClass:BookService}],
  imports: [CommonModule,RouterModule],
  templateUrl: './index.component.html',
  styleUrl: './index.component.css'
})
export class IndexComponent implements OnInit{


  book: Book[] = [];

  private academyService = inject<BookServiceI>(books_service_token);
  /*
  in fase di caricamento (ngOnInit) questa Component
  deve invocare il metodo getAcademies() della Classe
  AcademyService e, dopo aver ottenuto le Academies,
  le deve inserire in un Array il cui contenuto dovrà
  essere mostrato sul template
  */

  getBook(): void {

    this.academyService.getBook().subscribe({
      next: (res) => {
        this.book = res;
        console.log('Data fetched successfully', res);
      },
      error: (err) => {
        console.error('Error fetching data', err);
      }});
  }

  ngOnInit(): void {
    this.getBook();
  }

  removeBook(isbn: string) {

    this.academyService.removeBook(isbn).subscribe(res => {
      console.log(res.data);
      this.getBook();
    });
  }

}


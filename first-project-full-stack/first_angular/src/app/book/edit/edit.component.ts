import { ChangeDetectorRef, Component, inject, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { books_service_token, BookServiceI } from '../bookI.service';
import { BookService } from '../book.service';

import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Book } from '../mode/book.model';

@Component({
  selector: 'app-edit',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  providers: [{ provide: books_service_token, useClass: BookService }],
  templateUrl: './edit.component.html',
  styleUrl: './edit.component.css'
})
export class EditComponent implements OnInit {

  isbn! : string;

  form!: FormGroup;

book!: Book;



  private academyService = inject<BookService>(books_service_token);

  constructor( private router:Router,private route: ActivatedRoute, private cdn:ChangeDetectorRef) { }


    submit() {

      this.academyService.updateBook(this.form.value).subscribe((res: any) => {
        console.log('Book updated successfully!');
        this.router.navigateByUrl('book/index');
      })

    }
  ngOnInit(): void {

    this.isbn = this.route.snapshot.params['isbn'];

    this.academyService.getBookbyCode(this.isbn).subscribe((data) => {
      this.book = data;
      console.log(this.book);


    });

     this.form = new FormGroup({
       isbn: new FormControl(''),
       title: new FormControl(''),
       genre: new FormControl(''),
       published: new FormControl()
      });
    // this.cdn.detectChanges();
  }
}

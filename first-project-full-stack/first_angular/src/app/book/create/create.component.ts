import { Component, inject } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { books_service_token, BookServiceI } from '../bookI.service';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { BookService } from '../book.service';
@Component({
  selector: 'app-create',
  standalone: true,
  providers:[{provide:books_service_token,useClass:BookService}],
  imports: [CommonModule,ReactiveFormsModule],
  templateUrl: './create.component.html',
  styleUrl: './create.component.css'
})
export class CreateComponent {

  private router:Router = new Router();

  form!: FormGroup;


  private bookService = inject<BookServiceI>(books_service_token);

  submit() {

    this.bookService.saveBook(this.form.value).subscribe((res: any) => {
      console.log('Academy created successfully!');
      this.router.navigateByUrl('book/index');
    })

  }


  ngOnInit() {
    this.form = new FormGroup({
     isbn: new FormControl(''),
     title: new FormControl(''),
     genre: new FormControl(''),
     published: new FormControl(false)
    });

  }

}


import { Component, inject } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { profile_service_token, ProfileServiceI } from '../profileI.model';
import { CommonModule } from '@angular/common';
import { ProfileService } from '../profile.service';
import { Profile } from '../model/profile.model';

@Component({
  selector: 'app-create',
  standalone: true,
  providers:[{provide:profile_service_token,useClass:ProfileService}],
  imports: [CommonModule,ReactiveFormsModule],
  templateUrl: './create.component.html',
  styleUrl: './create.component.css'
})
export class CreateComponentProfile {

  private router:Router = new Router();

  form!: FormGroup;

  profile!: Profile;


  private bookService = inject<ProfileServiceI>(profile_service_token);

  submit() {

    this.bookService.saveProfile(this.form.value).subscribe((res: any) => {
      console.log('profile created successfully!');
      this.router.navigateByUrl('profile/index');
    })

  }


  ngOnInit() {
    this.form = new FormGroup({
     id: new FormControl(this.profile.id),
     firstName: new FormControl(''),
     lastName: new FormControl(''),
     isbn: new FormControl(this.profile.isbn),
    });
  }
  }

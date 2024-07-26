import { Component, inject, OnInit } from '@angular/core';
import { BookServiceI } from '../../book/bookI.service';
import { profile_service_token, ProfileServiceI } from '../profileI.model';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { Profile } from '../model/profile.model';
import { ProfileService } from '../profile.service';

@Component({
  selector: 'app-index',
  standalone: true,
  providers:[{provide:profile_service_token,useClass: ProfileService}],
  imports: [CommonModule,RouterModule],
  templateUrl: './index.component.html',
  styleUrl: './index.component.css'
})
export class IndexComponentProfile implements OnInit{


  profile:Profile[] = [];

  private academyService = inject<ProfileServiceI>(profile_service_token);
  /*
  in fase di caricamento (ngOnInit) questa Component
  deve invocare il metodo getAcademies() della Classe
  AcademyService e, dopo aver ottenuto le Academies,
  le deve inserire in un Array il cui contenuto dovrà
  essere mostrato sul template
  */

  getProfile(): void {

    this.academyService.getProfile().subscribe({
      next: (res) => {
        this.profile = res;
        console.log('Data fetched successfully', res);
      },
      error: (err) => {
        console.error('Error fetching data', err);
      }});
  }

  ngOnInit(): void {
    this.getProfile();
  }

  removeProfile(id: string) {

    this.academyService.removeProfile(id).subscribe(res => {
      console.log(res.data);
      this.getProfile();
    });
  }

}



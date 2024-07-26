import { Routes } from '@angular/router';
import { IndexComponent } from './book/index/index.component';
import { CreateComponent } from './book/create/create.component';
import { EditComponent } from './book/edit/edit.component';
import { IndexComponentProfile } from './profile/index/index.component';
import { CreateComponentProfile } from './profile/create/create.component';

export const routes: Routes = [
	{ path: '', redirectTo: 'book/index', pathMatch: 'full'},
	{ path: 'profile/index', component: IndexComponentProfile },
	{ path: 'profile/create', component: CreateComponentProfile },
	{ path: 'book/index', component: IndexComponent },
	{ path: 'book/create', component: CreateComponent },
	{ path: 'book/:isbn/edit', component: EditComponent }
	];

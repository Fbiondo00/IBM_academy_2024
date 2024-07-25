import { Routes } from '@angular/router';
import { IndexComponent } from './book/index/index.component';
import { CreateComponent } from './book/create/create.component';
import { EditComponent } from './book/edit/edit.component';

export const routes: Routes = [
	{ path: 'book', redirectTo: 'book/index', pathMatch: 'full'},
	{ path: 'book/index', component: IndexComponent },
	{ path: 'book/create', component: CreateComponent },
	{ path: 'book/:isbn/edit', component: EditComponent }
	];

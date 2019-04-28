import { Routes } from '@angular/router';
import { InicioComponent } from './inicio/inicio.component';
import { NfeComponent } from './nfe/nfe.component';

export const ROUTES: Routes = [
  { path: '', component: InicioComponent },
  { path: 'nfe', component: NfeComponent },
]

/*,{ path: '**', pathMatch:'full', redirectTo: 'routePath' }  */

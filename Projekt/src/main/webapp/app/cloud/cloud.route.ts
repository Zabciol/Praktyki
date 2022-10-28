import { Route } from '@angular/router';

import { CloudComponent } from './cloud.component';

export const navbarRoute: Route = {
  path: '',
  component: CloudComponent,
  outlet: 'navbar',
};
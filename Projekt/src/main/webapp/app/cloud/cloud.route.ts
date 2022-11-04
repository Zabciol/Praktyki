import { Route } from '@angular/router';

import { CloudComponent } from './cloud.component';

export const cloudRoute: Route = {
  path: '',
  component: CloudComponent,
  outlet: 'cloud',
};

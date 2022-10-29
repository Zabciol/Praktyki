import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SharedModule } from 'app/shared/shared.module';
import { navbarRoute } from './cloud.route';
import { CloudComponent } from './cloud.component';

@NgModule({
  imports: [SharedModule, RouterModule.forChild([navbarRoute])],
  declarations: [CloudComponent],
})
export class HomeModule {}

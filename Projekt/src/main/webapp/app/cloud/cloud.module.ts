import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';  
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { SharedModule } from 'app/shared/shared.module';
import { cloudRoute } from './cloud.route';
import { CloudComponent } from './cloud.component';

@NgModule({
  imports: [SharedModule, CommonModule, BrowserModule , RouterModule.forChild([cloudRoute])],
  declarations: [CloudComponent]
})
export class CloudModule {}

import{Component, OnInit, OnDestroy} from '@angular/core';
import{DupaService} from './dupa.service';
import {Dupa} from './Dupa';

@Component({
selector: 'jhi-dupa',
templateUrl: './dupa.component.html',
styleUrls: ['./dupa.component.scss'],
})
export class DupaComponent implements OnInit{
  dupa: Dupa = {text:'xxx'};

  constructor(private dupaService: DupaService){}

  ngOnInit(): void{
  this.dupaService.getDupa().subscribe(d =>{
    this.dupa = d;
    });
  }
}

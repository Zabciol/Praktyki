import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Subject } from 'rxjs';
import { takeUntil } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';

//import { CloudService } from './cloud.service';
import { AccountService } from 'app/core/auth/account.service';
import { Account } from 'app/core/auth/account.model';

@Component({
  selector: 'jhi-cloud',
  templateUrl: './cloud.component.html',
  styleUrls: ['./cloud.component.scss'],
})
export class CloudComponent implements OnInit {
  account: Account | null = null;

  private readonly destroy$ = new Subject<void>();

  constructor(private accountService: AccountService, private router: Router, private http: HttpClient) {}

  public file: any;
  public files: any[] = [];
  public menuToogle: boolean = false;

  ngOnInit(): void {
    this.accountService
      .getAuthenticationState()
      .pipe(takeUntil(this.destroy$))
      .subscribe(account => (this.account = account));
  }

  getFile(event: any) {
    this.file = event.target.files[0];
    // this.file = event.target.files[0];
    console.log('file: ', this.file);
    this.uploadFile();
  }

  uploadFile() {
    let formData = new FormData();
    formData.set('file', this.file);
    //this.files.push(formData)
    if (this.file.name != null) {
      this.files.push(this.file);
      this.http.post('/api/files', formData).subscribe(this.getFiles);
    } else {
      console.log('Wybierz plik');
    }
  }

  getFiles() {}



  toogleMenuOnItem(){
    this.menuToogle != this.menuToogle; 
    console.log("toogle menu item");
  }
}

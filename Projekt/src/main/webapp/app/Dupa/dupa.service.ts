import {Injectable} from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Dupa} from './Dupa'

@Injectable ({providedIn:'root'})
export class DupaService {
  constructor(private httpClient: HttpClient){}

  public getDupa(): Observable<Dupa>{
    return this.httpClient.get<Dupa>('/api/wtf');
  }

}

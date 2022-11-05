import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import {cloud} from  './cloud';

@Injectable ({providedIn: 'root'})
export class CloudService {
    constructor(private httpClient : HttpClient){}

    public getCloud() : Observable<cloud> {
        return this.httpClient.get<cloud>('api/files')
    }
}
import { Injectable } from '@angular/core';
import {Notif} from '../entities/notif';


import { Http, Response,Headers, RequestOptions  } from '@angular/http';
import 'rxjs/add/operator/map';




@Injectable()
export class NotifService {




    // spring url:    http://192.168.1.3:8080/notifications

    private notifUrl = "http://localhost:3000/api/notifications";

    constructor(private http : Http) { }


    getNotifications(){
      return this.http.get(this.notifUrl).map(res => res.json());
    }


    post_notification(titre:string,contenue:string){
      

      let jsonRequest = {titre:titre,contenue:contenue};
      let headers = new Headers({ 'Content-Type': 'application/json' });
      let options = new RequestOptions({ headers: headers });
    
      
      return this.http.post(this.notifUrl,jsonRequest,options).map(res => res.json);

    }


}

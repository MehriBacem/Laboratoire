import { Injectable } from '@angular/core';


import { Member } from '../entities/member';

import { Http, Response,Headers, RequestOptions  } from '@angular/http';
import 'rxjs/add/operator/map';


@Injectable()
export class MembersService {



// spring url:    http://192.168.1.3:8080/membres

    private membersUrl = "http://localhost:3000/api/membres";
    private signUpUrl = "http://localhost:3000/api/sign_up";
    private signUpForReal = "http://localhost:3000/api/sign_up_for_real";
    private url = "http://localhost:3000/api/sign_up_remove_request";

    constructor(private http : Http) { }    


    getMembers() {
        return this.http.get(this.membersUrl)
        .map(res => res.json());
    }

    getMember(id:number){
      const url = `${this.membersUrl}/${id}`;
      return this.http.get(url)
      .map(res => res.json());
    }


    getListOfJoinRequests(){
        return this.http.get(this.signUpUrl).map(res => res.json());
    }

    addNewMember(member){

      let headers = new Headers({ 'Content-Type': 'application/json' });
      let options = new RequestOptions({ headers: headers });
    
      return this.http.post(this.signUpForReal,member,options);
    }

    delete(member){
         let headers = new Headers({ 'Content-Type': 'application/json' });
         let options = new RequestOptions({ headers: headers });  
    
         return this.http.post(this.url,member,options).map(res => res.json());
    }

}

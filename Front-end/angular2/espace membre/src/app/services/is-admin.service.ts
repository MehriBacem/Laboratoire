import { Injectable ,OnInit} from '@angular/core';

import {Http,Headers,RequestOptions} from '@angular/http';
import 'rxjs/add/operator/map';

import {IdService} from './id.service';

@Injectable()
export class IsAdminService {


  private state; //admin or not
  constructor(private http:Http,private idService : IdService) { }
  
  is_admin(){
    
    //get id of user
    let id_user = this.idService.getId();

    //make request object
    let jsonRequest = {id_user:id_user};

    //request options
    let headers = new Headers({"Content-Type":"application/json"});
    let options = new RequestOptions({headers:headers});

    

    return this.http.post("http://localhost:3000/api/is_admin",jsonRequest,options)  
    .map(res => res.json());
    }


}

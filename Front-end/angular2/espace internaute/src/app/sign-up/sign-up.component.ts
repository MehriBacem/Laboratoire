import { Component, OnInit } from '@angular/core';

import {SignUpService} from '../services/sign-up.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css'],
  providers:[SignUpService]
})
export class SignUpComponent implements OnInit {

  constructor(private signUpService : SignUpService) { }

  private nom:string;
  private email:string;
  private date_naissance:string;
  private addresse:string;
  private num_tel:string;
  private cin:string;
  private status:string;
  private titre:string;
  private alias:string;
  private passwd:string;
  private pos_actuelle:string;


  ngOnInit() {
  }




  logFormData(){
    console.log(this.nom);
    let jsonObj = {
      nom_prenom:this.nom,
      date_naissance:this.date_naissance,
      email:this.email,
      numero_tel:[this.num_tel],   /**this might cause some problems */
      passwd:this.passwd,
      titre:this.titre,
      status:this.status,
      adresse:this.addresse,
      alias:this.alias,
      num_cin:this.cin,
      position_actuelle:this.pos_actuelle
    }

    this.signUpService.send_request(jsonObj)
    .subscribe(server_responce => console.log('request sent to server'));
  }



}

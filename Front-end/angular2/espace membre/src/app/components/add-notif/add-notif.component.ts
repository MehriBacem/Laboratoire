import { Component, OnInit } from '@angular/core';


import {NotifService} from '../../services/notif.service';

import {Router} from '@angular/router';


@Component({
  selector: 'app-add-notif',
  templateUrl: './add-notif.component.html',
  styleUrls: ['./add-notif.component.css'],
  providers:[NotifService]
})
export class AddNotifComponent implements OnInit {

  private contenue:string;
  private titre:string;
  private status:string;


  constructor(private notifService : NotifService,private router : Router) { }

  ngOnInit() {
  }

  add_notif(){
    console.log('adding notification');
    this.notifService.post_notification(this.titre,this.contenue).subscribe(res => {
      this.status = "Notification ajouté, redirection en cours ";
      console.log('notifacation added to database');
      let router = this.router;
      setTimeout(function(){
        router.navigate['notif'];
        console.log('done');
      },1000);  
    
      
    }) ;
  }

}

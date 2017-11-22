import { Component, OnInit } from '@angular/core';

import {Notif} from '../../entities/notif';
import {Member} from '../../entities/member';

import {NotifService} from '../../services/notif.service';
import {MembersService} from '../../services/members.service';


import {Router} from '@angular/router';


@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css'],
  providers:[NotifService,MembersService]
})
export class AdminComponent implements OnInit {

  private notifications:Notif[];
  private members:Member[];
  constructor(private notifService : NotifService,
              private router : Router,
              private membersService : MembersService) {}

   routeMe(){
     this.router.navigate(['addmember']);
     console.log('route me');
   }

  ngOnInit() {
    this.notifService.getNotifications().subscribe(notifs => this.notifications = notifs);
    this.membersService.getMembers().subscribe(members => this.members = members);

  }


  delete(targetMember){
    console.log('ok il delete him !!');
    this.members = this.members.filter(function(member){return targetMember != member});
  }

  add_notif_router(){
    this.router.navigate(['add_notif']);
  }

  active(){
    console.log('something ');
  }

  redirect_me(){
    this.router.navigate(['add_forum']);
  }

  remove_notification(notification:Notif){
    this.notifications =  this.notifications.filter(function(notif){return notification != notif});
    console.log('c bon');
  }


}

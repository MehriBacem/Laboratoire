import { Component, OnInit } from '@angular/core';

import {Router} from '@angular/router';

import {Member} from '../../entities/member';
import {MembersService} from '../../services/members.service';
import {TchatService} from '../../services/tchat.service';



@Component({
  selector: 'app-add-group-chat',
  templateUrl: './add-group-chat.component.html',
  styleUrls: ['./add-group-chat.component.css'],
  providers:[MembersService,TchatService]
})
export class AddGroupChatComponent implements OnInit {

  constructor(private router:Router,
              private membersService:MembersService,
              private tchatService : TchatService) { }


 private members:Member[];
 private selectedMembers:Member[] = [];
 private index;

 private nom_groupe = "";

  ngOnInit() {
    this.membersService.getMembers().subscribe(res => {this.members = res;
       
    }); 
  }


select_member(member:Member){
  this.selectedMembers.push(member);
}


  //create groupe chat
  not_ready_component(){


    this.tchatService.make_groupe_tchat(this.nom_groupe,this.selectedMembers).subscribe(res => console.log('group created'));

    // navigate to chat component
    // this.router.navigate(['/not_ready']);
  }

}

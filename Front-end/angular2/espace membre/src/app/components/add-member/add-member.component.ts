import { Component, OnInit } from '@angular/core';

import {Member } from '../../entities/member';
import {MembersService} from '../../services/members.service';



@Component({
  selector: 'app-add-member',
  templateUrl: './add-member.component.html',
  styleUrls: ['./add-member.component.css'],
  providers:[MembersService]
})
export class AddMemberComponent implements OnInit {

  private members : Member[];

  constructor(private memberService : MembersService) { }

  ngOnInit() {
    this.memberService.getListOfJoinRequests().subscribe(res => this.members = res );
  }

  accept(newMember){
    this.memberService.addNewMember(newMember).subscribe(res =>{
      console.log('member added to database');
      //sucess message here
      this.members = this.members.filter(function(member){return member != newMember});

    } );
    //this is not needed since the server will automatically delete the new member
    // this.memberService.delete(newMember).subscribe(res => console.log('added to node server successfully'));
  }
  refuse(member_to_delete){
    this.members = this.members.filter(function(member){return member != member_to_delete});
  }

}

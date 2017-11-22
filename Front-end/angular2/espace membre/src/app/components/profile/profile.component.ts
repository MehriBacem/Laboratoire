import { Component, OnInit } from '@angular/core';

import {Profile } from '../../entities/profile';
import {ProfileService} from '../../services/profile.service';
import {IdService} from '../../services/id.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css'],
  providers:[ProfileService]
})
export class ProfileComponent implements OnInit {

  profile:Profile;
  progres:number;
  constructor(private profileService : ProfileService,private idService: IdService) {

  }

  ngOnInit() {

    this.profileService.getProfile(this.idService.getId()).subscribe(profile => this.profile = profile);
  }

}

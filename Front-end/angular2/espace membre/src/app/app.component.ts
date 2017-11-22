import { Component ,OnInit} from '@angular/core';

import {InputSwitchModule} from 'primeng/primeng';
import {IsAdminService} from './services/is-admin.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[IsAdminService]
})
export class AppComponent {
  
  // if not set then the button to the admin service will not appear
  private is_admin_or_not:string;

  constructor(private isAdminService : IsAdminService){}

  ngOnInit(){
    this.isAdminService.is_admin().subscribe(res => {
      if(res.status =="true"){
        this.is_admin_or_not = "yeah";
        console.log('in heere');
    }
    
    });
    console.log('okkkkk');
  }


  test(){
    console.log(this.is_admin_or_not);
  }

}

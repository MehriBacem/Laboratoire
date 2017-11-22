import { Component, OnInit } from '@angular/core';
import  {Router} from '@angular/router';
import {SignInService} from '../services/sign-in.service';



class AuthResponce{
  res:string;
}



@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css'],
  providers:[SignInService]
})
export class SignInComponent implements OnInit {

  private alias:string;
  private passwd:string;
  private errMessage : string;
  private successMessage : string;
  constructor(private router : Router,private signInService : SignInService) { }





  ngOnInit() {
  }

redirect(id:string){

}

private ac : AuthResponce;
  submit(){
    this.signInService.check(this.alias,this.passwd)
    .subscribe(res => {
      if(res.res == "authorized"){
        this.errMessage = '';
        this.successMessage = 'Authentification reussite, connextion en cour ..'; 
        setTimeout(function(){
          console.log('redirecting now  ' );
          let url:string =  "http://localhost:4201/welcome/" + res.id;
          console.log(url);
          window.location.href = url; 
        },1000);
      }else{
        console.log('you do not have acceess');
        this.errMessage = 'Verifier votre alias ou votre mot de passe!';
      }
    });     
  }

  redirectTo(){
    this.router.navigate(['/inscription']);
  }
}
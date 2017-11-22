import { Component, OnInit } from '@angular/core';

var io = require('socket.io-client');

var buffer = "";
var myAction = false;


@Component({
  selector: 'app-online-doc',
  templateUrl: './online-doc.component.html',
  styleUrls: ['./online-doc.component.css']
})
export class OnlineDocComponent implements OnInit {

  private socket:any;
  private socket_server_port = 3001;
  private textadeyos:String;

  constructor() { }



  ngOnInit() {
      this.socket = io('http://localhost:' + this.socket_server_port);
      
    
      // initiate socket events
    
      // connection
      this.socket.on('connect',function(){console.log('connected to the server:!')});

      // textadeyosarea update
      this.socket.on('update',  function(msg){
        if(! myAction){
          buffer = msg;
          // calling the test method (i got the name from the compiled file (bundle.js))
          OnlineDocComponent.prototype.test();
          console.log('trying to update to -> '  + msg);
        }else{
          myAction = false;
        }

    }  );

  }

  test(){
    console.log('test actice, buffer->' + buffer);
    this.textadeyos = buffer;
    console.log('textadeyos is now -> ' + this.textadeyos);
  }  

  update_state(){
          console.log('initializing update to -> ' + this.textadeyos);
          myAction = true;
          this.socket.emit('input_update',this.textadeyos);
  }

}

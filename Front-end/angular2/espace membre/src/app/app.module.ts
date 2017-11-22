import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import {RouterModule } from '@angular/router';


//angular material components
import {MdButtonModule} from '@angular2-material/button';
import {MdCardModule} from '@angular2-material/card';
import {MdInputModule} from '@angular2-material/input';
import {MdListModule} from '@angular2-material/list';
import {MdTabsModule} from '@angular2-material/tabs';

import { AppComponent } from './app.component';
import { ProfileComponent } from './components/profile/profile.component';
import { DocsComponent } from './components/docs/docs.component';
import { ChatComponent } from './components/chat/chat.component';
import { ProjetsComponent } from './components/projets/projets.component';
import { ProjetComponent } from './components/projet/projet.component';
import { NotificationCenterComponent } from './components/notification-center/notification-center.component';
import { AddGroupChatComponent } from './components/add-group-chat/add-group-chat.component';
import { AdminComponent } from './components/admin/admin.component';
import { AddMemberComponent } from './components/add-member/add-member.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { OnlineDocComponent } from './components/online-doc/online-doc.component';
import { NotReadyComponent } from './components/not-ready/not-ready.component';
import { AddNotifComponent } from './components/add-notif/add-notif.component';









// singleton services
// do not declare these services as providers when needed
import {IdService} from './services/id.service';
import {IsAdminService} from './services/is-admin.service';
import { ForumRequestsComponent } from './components/forum-requests/forum-requests.component';




@NgModule({
  declarations: [
    AppComponent,
    ProfileComponent,
    DocsComponent,
    ChatComponent,
    ProjetsComponent,
    ProjetComponent,
    NotificationCenterComponent,
    AddGroupChatComponent,
    AdminComponent,
    AddMemberComponent,
    WelcomeComponent,
    OnlineDocComponent,
    NotReadyComponent,
    AddNotifComponent,
    ForumRequestsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    MdButtonModule,
    MdListModule,
    MdCardModule,
    MdInputModule,
    MdTabsModule,
    RouterModule.forRoot([
      {path:'profile',component:ProfileComponent},
      {path:'docs',component:DocsComponent},
      {path:'notif',component:NotificationCenterComponent},
      {path:'chat',component:ChatComponent},
      {path:'projets',component:ProjetsComponent},
      {path:'projet',component:ProjetComponent},
      {path:'addgroupechat',component:AddGroupChatComponent},
      {path:'admin',component:AdminComponent},
      {path:'addmember',component:AddMemberComponent},
      {path:'welcome/:id',component:WelcomeComponent},
      {path:'edit',component:OnlineDocComponent},
      {path:'not_ready',component:NotReadyComponent},
      {path:'add_notif',component:AddNotifComponent},
      {path:'add_forum',component:ForumRequestsComponent}
      ])
  ],
  providers: [IdService],
  bootstrap: [AppComponent]
})
export class AppModule { }

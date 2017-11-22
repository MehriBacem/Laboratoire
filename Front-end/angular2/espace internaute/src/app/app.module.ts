import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule ,JsonpModule } from '@angular/http';

//router module
import {RouterModule} from '@angular/router';

//adding hammerjs for slide toggle
import 'hammerjs';


//angular material components
import {MdButtonModule} from '@angular2-material/button';
import {MdIconModule} from '@angular2-material/icon';
import {MdIconRegistry} from '@angular2-material/icon';
import {MdCardModule} from '@angular2-material/card';
import {MdTabsModule} from '@angular2-material/tabs'; 
import {MdInputModule} from '@angular2-material/input';
import {MdSliderModule} from '@angular2-material/slider';
import {MdListModule} from '@angular2-material/list';
import {MdToolbarModule} from '@angular2-material/toolbar';
import {MdRadioModule} from '@angular2-material/radio';



import { AppComponent } from './app.component';
import { HeadComponent } from './body/head/head.component';
import { FooterComponent } from './body/footer/footer.component';
import { HomeImageComponent } from './home-image/home-image.component';
import { HomeBodyComponent } from './home-body/home-body.component';
import { HomeComponent } from './home/home.component';
import { CvViewerComponent } from './cv-viewer/cv-viewer.component';
import { ReportViewerDetailComponent } from './report-viewer-detail/report-viewer-detail.component';
import { ReportViewerComponent } from './report-viewer/report-viewer.component';
import { ListReportViewerComponent } from './list-report-viewer/list-report-viewer.component';
import { AdminContactComponent } from './admin-contact/admin-contact.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { ForumsViewerComponent } from './forums-viewer/forums-viewer.component';
import { ForumViewerComponent } from './forum-viewer/forum-viewer.component';
import { NewsViewerComponent } from './news-viewer/news-viewer.component';
import { MembersViewerComponent } from './members-viewer/members-viewer.component';
import { MemberViewerComponent } from './member-viewer/member-viewer.component';
import { ForumCreatorComponent } from './forum-creator/forum-creator.component';
import { TimeapiTestComponent } from './test/timeapi-test/timeapi-test.component';


@NgModule({
  declarations: [
    AppComponent,
    HeadComponent,
    FooterComponent,
    HomeImageComponent,
    HomeBodyComponent,
    HomeComponent,
    CvViewerComponent,
    ReportViewerDetailComponent,
    ReportViewerComponent,
    ListReportViewerComponent,
    AdminContactComponent,
    SignInComponent,
    SignUpComponent,
    ForumsViewerComponent,
    ForumViewerComponent,
    NewsViewerComponent,
    MembersViewerComponent,
    MemberViewerComponent,
    ForumCreatorComponent,
    TimeapiTestComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    MdIconModule,
    MdButtonModule,
    MdCardModule,
    MdToolbarModule,
    JsonpModule,
    MdTabsModule,
    MdRadioModule,
    MdInputModule,
    MdSliderModule,
    MdListModule,
    RouterModule.forRoot([
      {path:'acceil',component:HomeComponent},
      {path:'news',component:NewsViewerComponent},
      {path:'forums',component:ForumsViewerComponent},
      {path:'membres',component:MembersViewerComponent},
      {path:'membres/:id',component:MemberViewerComponent}, /* copy the component MembreprofieleViewer */
      {path:'publications',component:ListReportViewerComponent},
      {path:'contact',component:AdminContactComponent},
      {path:'connextion',component:SignInComponent},
      {path:'inscription',component:SignUpComponent},
      {path:'publication/:id',component:ReportViewerDetailComponent},
      {path:'cv/:id',component:CvViewerComponent},
      {path:'forum/:id',component:ForumViewerComponent},
      {path:'forumcreation',component:ForumCreatorComponent}
      ])
  ],
  providers: [MdIconRegistry],
  bootstrap: [AppComponent]
})
export class AppModule { 


}

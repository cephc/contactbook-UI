import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'
import { AppComponent } from './app.component';
import { PersonListComponent } from './person-list/person-list.component';
import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule} from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PersonEditComponent } from './person-edit/person-edit.component';
import { FormsModule } from '@angular/forms'
import { PersonService } from 'src/app/shared/person/person.service'
import { AppRoutingModule } from 'src/app/app-routing.module'

@NgModule({
  declarations: [
    AppComponent,
    PersonListComponent,
    PersonEditComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    FormsModule,
    AppRoutingModule

    
  ],
  providers: [PersonService],
  bootstrap: [AppComponent]
})
export class AppModule { }

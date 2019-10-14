import {Component, NgModule} from '@angular/core';
import { Observable } from 'rxjs';
import { Http } from '@angular/http';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {count} from 'rxjs/operators';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {

  // tslint:disable-next-line:ban-types
  title = 'weather';
  name = 'country';
  country='';

  constructor(private httpClient: HttpClient) {


  }
  private searchCountry(): void {
       this.httpClient.get(`https://api.openweathermap.org/data/2.5/weather?q=${this.country}&apiKey=26ac1ae3db4ec81ec8279350fe12ea95`)
         .subscribe(data => {
             console.log(data);
             this.name =  data.weather[0].main;
           },
           error => {
             console.log('oops', error);
             this.name ='error';

           });
  }
  private addCountry(country: string): void {
       this.country=country;
  }




}


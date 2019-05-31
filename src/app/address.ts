import { Geo } from 'src/app/geo';

export interface Address{
    street: string;
    suite: string;
    city: string;
    zipcode: string;
    geo: Geo;
}
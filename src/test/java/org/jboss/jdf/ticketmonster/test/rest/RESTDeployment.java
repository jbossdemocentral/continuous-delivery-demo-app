package org.jboss.jdf.ticketmonster.test.rest;

import org.jboss.jdf.example.ticketmonster.model.Booking;
import org.jboss.jdf.example.ticketmonster.rest.BaseEntityService;
import org.jboss.jdf.example.ticketmonster.rest.dto.VenueDTO;
import org.jboss.jdf.example.ticketmonster.service.*;
import org.jboss.jdf.example.ticketmonster.util.MultivaluedHashMap;
import org.jboss.jdf.ticketmonster.test.TicketMonsterDeployment;
import org.jboss.shrinkwrap.api.spec.WebArchive;

public class RESTDeployment {

    public static WebArchive deployment() {


        return TicketMonsterDeployment.deployment()
                .addPackage(Booking.class.getPackage())
                .addPackage(BaseEntityService.class.getPackage())
                .addPackage(VenueDTO.class.getPackage())
                .addPackage(MultivaluedHashMap.class.getPackage())
                .addPackage(SeatAllocationService.class.getPackage())
                .addClass(AllocatedSeats.class)
                .addClass(MediaPath.class)
                .addClass(MediaManager.class);
    }
    
}

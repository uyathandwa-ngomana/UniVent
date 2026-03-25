package za.ac.cput.repository;

/**
 *Name: Uyathandwa
 *Surname: Ngomana
 *Student number: 231173229
 *Group: 3H
 *Description:IEventRepository
 * Date: 25 March 2026
 **/

import za.ac.cput.domain.Event;
import za.ac.cput.domain.Organizer;
import java.util.List;

    public interface IEventRepository extends IRepository<Event, Integer> {

        Event findByName(String name);

        List<Event> findByDateTime(String dateTime);

        List<Event> findByMaxAttendees(int maxAttendees);

        List<Event> findByDescription(String description);

        List<Event> findByOrganizer(Organizer organizer);
    }


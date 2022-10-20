/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import java.util.*;
import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoComandos extends PBlocoComandos
{
    private TIniBloco _iniBloco_;
    private final LinkedList<PDecsVarConst> _decsVarConst_ = new LinkedList<PDecsVarConst>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();
    private TFimBloco _fimBloco_;

    public ABlocoComandos()
    {
        // Constructor
    }

    public ABlocoComandos(
        @SuppressWarnings("hiding") TIniBloco _iniBloco_,
        @SuppressWarnings("hiding") List<?> _decsVarConst_,
        @SuppressWarnings("hiding") List<?> _comando_,
        @SuppressWarnings("hiding") TFimBloco _fimBloco_)
    {
        // Constructor
        setIniBloco(_iniBloco_);

        setDecsVarConst(_decsVarConst_);

        setComando(_comando_);

        setFimBloco(_fimBloco_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoComandos(
            cloneNode(this._iniBloco_),
            cloneList(this._decsVarConst_),
            cloneList(this._comando_),
            cloneNode(this._fimBloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoComandos(this);
    }

    public TIniBloco getIniBloco()
    {
        return this._iniBloco_;
    }

    public void setIniBloco(TIniBloco node)
    {
        if(this._iniBloco_ != null)
        {
            this._iniBloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._iniBloco_ = node;
    }

    public LinkedList<PDecsVarConst> getDecsVarConst()
    {
        return this._decsVarConst_;
    }

    public void setDecsVarConst(List<?> list)
    {
        for(PDecsVarConst e : this._decsVarConst_)
        {
            e.parent(null);
        }
        this._decsVarConst_.clear();

        for(Object obj_e : list)
        {
            PDecsVarConst e = (PDecsVarConst) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decsVarConst_.add(e);
        }
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    public TFimBloco getFimBloco()
    {
        return this._fimBloco_;
    }

    public void setFimBloco(TFimBloco node)
    {
        if(this._fimBloco_ != null)
        {
            this._fimBloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimBloco_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._iniBloco_)
            + toString(this._decsVarConst_)
            + toString(this._comando_)
            + toString(this._fimBloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._iniBloco_ == child)
        {
            this._iniBloco_ = null;
            return;
        }

        if(this._decsVarConst_.remove(child))
        {
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        if(this._fimBloco_ == child)
        {
            this._fimBloco_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._iniBloco_ == oldChild)
        {
            setIniBloco((TIniBloco) newChild);
            return;
        }

        for(ListIterator<PDecsVarConst> i = this._decsVarConst_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecsVarConst) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._fimBloco_ == oldChild)
        {
            setFimBloco((TFimBloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
